#!/bin/bash
SOURCE="$0"
while [ -h "$SOURCE"  ]; do # resolve $SOURCE until the file is no longer a symlink
DIR="$( cd -P "$( dirname "$SOURCE"  )" && pwd  )"
SOURCE="$(readlink "$SOURCE")"
[[ $SOURCE != /*  ]] && SOURCE="$DIR/$SOURCE" # if $SOURCE was a relative symlink, we need to resolve it relative to the path where the symlink file was located
done
DIR="$( cd -P "$( dirname "$SOURCE"  )" && pwd  )"
cd $DIR
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
