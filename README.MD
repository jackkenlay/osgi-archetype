# OSGi Skeleton Bundle Maven Archetype

## Installation of Archetype:
* Clone this repo
* run ```mvn install && mvn install archetype:update-local-catalog && mvn archetype:crawl```

## To Use
```mvn archetype:generate -DarchetypeGroupId=com.ensemble -DarchetypeArtifactId=osgi-archetype -DarchetypeVersion=1.0```


## To use bundle after:
* (in bundle directory) ```mvn clean install```
* (in Apache Karaf) ```bundle:install -s mvn:com.ensemble/my-test-component```

