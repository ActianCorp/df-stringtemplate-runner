# df-stringtemplate-runner

The StringTemplate Runner is an operator for Actian DataFlow for running [StringTemplate](http://www.stringtemplate.org/) template engine to generate text from data in the dataflow pipeline.

## Configuration

Before building stringtemplate you need to define the following environment variables to point to the local DataFlow update site [dataflow-p2-site](https://github.com/ActianCorp/dataflow-p2-site) root directory and the DataFlow version.

    export DATAFLOW_REPO_HOME=/Users/myuser/dataflow-p2-site
    export DATAFLOW_VER=6.5.0.117

## Building

The update site is built using [Apache Maven 3.0.5 or later](http://maven.apache.org/).

To build, run:

    mvn clean install

## Using the StringTemplate Runner with the DataFlow Engine

The build generates a JAR file in df-stringtemplate-runner/stringtemplate-op/target called stringtemplate-op-0.0.1-SNAPSHOT.jar which can be included on the classpath when using the DataFlow engine.

## Installing the StringTemplate Runner plug-in in KNIME

The build also produces a ZIP file which can be used as an archive file with the KNIME 'Help/Install New Software...' dialog.
The ZIP file can be found in df-stringtemplate-runner/stringtemplate-ui-top/update-site/target and is called com.actian.ilabs.dataflow.stringtemplate.ui.update-0.0.1-SNAPSHOT.zip

The file examples/KNIME/StringTemplate_Runner_Example.zip contains a KNIME workflow that can be imported into KNIME and used to test the plug-in.



