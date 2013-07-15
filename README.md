# hive

Simple application to hyphenate whole sentences.

## Usage

```
$ lein run
```

## Requirements

Requires libhypenjna installed. Please see my other repo until deps
are set up properly.

Clone libhypenjna.

```
$ cd libhypenjna
$ ant
$ mvn install:install-file -Dfile=build/jar/hyphen.jar -DgroupId=name.benjaminpeter -DartifactId=hyphen -Dversion=1.0.0 -Dpackaging=jar
```

## License

Copyright © 2013 Benjamin Peter <benjaminpeter@arcor.de>

Distributed under the Eclipse Public License, the same as Clojure.
