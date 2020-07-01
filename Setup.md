## Run mysql in docker

### start image command

```shell
docker pull mysql:5.7
```



```shell
docker run -p 3306:3306 --name mysql \
 -v /mydata/mysql/log:/var/log/mysql \
 -v /mydata/mysql/data:/var/lib/mysql \
 -v /mydata/mysql/conf:/etc/mysql \
 -e MYSQL_ROOT_PASSWORD=root \
 -d mysql:5.7
```

### add my.cnf  for mysql

```tex
[client]
default-character-set=utf8

[mysql]
default-character-set=utf8
[mysqld]
init_connect='SET collation_connection = utf8_unicode_ci'
init_connect='SET NAMES utf8'
character-set-server=utf8
collection-server=utf8_unicode_ci
skip-character-set-client-handshake
skip-name-resolve
```

### solve selinux issue

```shell
chcon -Rt svirt_sandbox_file_t /mydata/mysql/log
chcon -Rt svirt_sandbox_file_t /mydata/mysql/data
chcon -Rt svirt_sandbox_file_t /mydata/mysql/conf
```



## Run redis in docker

### add redis config

```tex
mkdir -p /mydata/redis/conf
touch /mydata/redis/conf/redis.conf
```

### edit redis.conf . this is for Redis Persistence.

```tex
appendonly yes
```

### run redis in docker

```shell
docker pull redis
```



```shell
docker run -p 6379:6379 --name redis -v /mydata/redis/data:/data \
-v/mydata/redis/conf/redis.conf:/etc/redis/redis.conf \
-d redis redis-server /etc/redis/redis.conf
```

