#!/bin/sh

( cd generated-java-src && jar cvf ../generated-java-src.jar com )
( cd generated-scala-src && jar cvf ../generated-scala-src.jar com )