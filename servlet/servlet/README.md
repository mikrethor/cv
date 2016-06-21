# WildFly Swarm Servlet

## War generation

In order to generate the all in one war :
```
mvn  clean install -P swarm
```

## Deploy

To deploy the jar 2 choices

### Maven command

In order to deploy the war you have to use this goal :
```
mvn wildfly-swarm:run -P swarm
```

### Java -jar 

In order to deploy the war you have to use this goal :
```
mvn wildfly-swarm:run -P swarm
```

## One more thing

To install this servlet on a Raspberry Pi
* Download Java SE Development Kit 8u91 Linux ARM 32 Hard Float ABI
* sudo tar zxvf jdk-8u91-linux-arm32-vfp-hflt.tar.gz -C /opt
* sudo update-alternatives --install /usr/bin/javac javac /opt/jdk1.8.0_91/bin/javac 1
* sudo update-alternatives --install /usr/bin/java java /opt/jdk1.8.0_91/bin/java 1
* set JAVA_HOME="/usr/lib/jvm/jdk-7-oracle-armhf"
* set PATH="........:usr/lib/jvm/jdk-7-oracle-armhf/bin"
* sudo update-alternatives --config javac
* sudo update-alternatives --config java


