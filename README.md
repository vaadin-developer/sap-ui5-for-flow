
<center>
<a href="https://vaadin.com">
 <img src="https://vaadin.com/images/hero-reindeer.svg" width="200" height="200" /></a>
</center>


# SAP UI 5 - Webcomponents for Vaadin Flow

## THIS README IS WORK IN PROGRESS
This repo is under active development. 
In this early stage, changes are bigger if need.
After the release 1.0.0 is defined, the API will be stable.


## SAP Components
[Component Playground](https://sap.github.io/ui5-webcomponents/playground/)
* [Icons](https://openui5.hana.ondemand.com/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons/?tab=grid&icon=activate)
* [Timeline](https://github.com/SAP/ui5-webcomponents/blob/master/packages/main/src/Timeline.js)
* [NPM UI5](https://www.npmjs.com/package/@ui5/webcomponents)

## Maven 
To understand what is going on during the build process use the following command

```bash
mvn fr.jcgay.maven.plugins:buildplan-maven-plugin:list
```

## Supported JDK
This example is running from JDK8 up to JDK13

## Support for Heroku
To support the Heroku pipeline we need a few preparations.
1) the app must be able to get a configured port for the http port during the start up
1) add the shade plugin to create a fat jar
1) create the file **Procfile** and add the line 
    ```web: java -jar target/vaadin-app.jar -port $PORT```
    * **web** - to activate the web profile
    * **-jar** - define what fat jar must be started
    * **-port** make the dynamic associated port available for the app
1) add a file **settings.xml** to configure the maven build process

### For this project
This project contains a demo that is using the SAP UI 5 WebComponents for Flow.
The Demo itself is located inside the module **03_demoapp**.
The URL to have a look at this demo is [https://flow-sap-ui5.herokuapp.com/](https://flow-sap-ui5.herokuapp.com/)
However, if you want to have a look at it on your machine you can run the Docker image that is provided as well.

The basic demoapp is created with the Vaadin App Starter. [https://start.vaadin.com](https://start.vaadin.com)
### Docker DemoApp
**TBD**

## target of this project
With this project, we want to provide a serverside java API to work with SAP UI 5 
webcomponents. The Java-part is under Apache Lic.

## project structure / modules

## How to use it

## Roadmap - bird eye view




Happy Coding.

if you have any questions: ping me on Twitter [https://twitter.com/SvenRuppert](https://twitter.com/SvenRuppert)
or via mail.
