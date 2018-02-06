# OSGi Skeleton Bundle Maven Archetype

## Installation of Archetype:
* Clone this repo
* run ```mvn install && mvn install archetype:update-local-catalog && mvn archetype:crawl```

## To Use
```mvn archetype:generate -DarchetypeGroupId=com.ensemble -DarchetypeArtifactId=osgi-archetype -DarchetypeVersion=1.0 -DgroupId=com.ensemble.test -DartifactId=my-new-project```


## To use bundle after:
(in bundle directory) ```mvn install```



