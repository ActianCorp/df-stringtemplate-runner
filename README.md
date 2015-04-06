# stringtemplate

The StringTemplate Runner is an operator for Actian DataFlow for running [StringTemplate](http://www.stringtemplate.org/) template groups to generate text from data in the dataflow pipeline. 

## Configuration

Before building stringtemplate you need to define the following environment variables to point to the local DataFlow update site [dataflow-p2-site](https://github.com/ActianCorp/dataflow-p2-site) root directory and the DataFlow version.

    export DATAFLOW_REPO_HOME=/Users/myuser/dataflow-p2-site
    export DATAFLOW_VER=6.5.0.117

## Building

The update site is built using [Apache Maven 3.0.5 or later](http://maven.apache.org/).

To build, run:

    mvn clean install



