zooinspector
============

This is fork of: https://github.com/zzhang5/zooinspector


#### An improved zookeeper inspector

- Use async operations to speed up read
- Znodes sorted by names in tree viewer
- Timestamp and session id in more readable format in node metadata viewer
- Add a dropdown menu to show the last 10 successfully connected zookeeper addresses
- Support text search in node data viewer
- Support read-only mode for node data viewer


### Download and Run zooinspector executable jar

```shell
wget https://github.com/sushantmane/zooinspector/releases/download/v0.0.4/zooinspector-1.0-SNAPSHOT-all.jar
```
```shell
java -jar zooinspector-1.0-SNAPSHOT-all.jar
```



### To Build and Run on local system
```bash
git clone https://github.com/sushantmane/zooinspector.git
```
```bash
cd zooinspector
```
```bash
mvn clean package
```
```bash
java -jar target/zooinspector-1.0-SNAPSHOT-all.jar 
```
