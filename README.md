# ![Produktlogo](https://github.com/jmurighub/SeicentoSalary/blob/master/docs/images/seicento_salary.png "Logo") ![xwr.ch](https://github.com/jmurighub/SeicentoSalary/blob/master/docs/images/XWareLogo.png "xwr.ch")
[![Build status](https://xwr.visualstudio.com/XWare/_apis/build/status/Dockerhub%20SeicentoSalary-FromTemplate-Task)](https://xwr.visualstudio.com/XWare/_build/latest?definitionId=22)
         
SeicentoSalary ist eine Weblösung für die Verwaltung von Lohnzahlungen nach Schweizer Recht. Die App ist seit mehreren Jahren produktiv im Einsatz.  

Die Sourcen der Lösung sind auf [Github](https://github.com/jmurighub/SeicentoSalary) unter der Apache 2.0 Lizenz verfügbar.
Ein Docker Image kann von [Dockerhub](https://cloud.docker.com/repository/docker/jmurihub/seicentosalary/general) bezogen werden.

## Toolstack
Folgende technische Komponenten kommen zum Einsatz
* [Rapidclipse IDE (Eclipse basiert)](http://rapidclipse.com) (Java, Vaadin, Hibernate ....)
* [Tomcat 8.5](https://tomcat.apache.org/download-80.cgi)
* MSSQL als DB
* [Jasperserver](https://community.jaspersoft.com/project/jasperreports-server)
* [Docker](https://docker.com)
* Azure AD
 

## Installation SeicentoSalary als Docker Image
Folgende Voraussetzungen müssen erfüllt sein für die Installation:
* bestehendes Azure AD Konto
* Docker (auf lokaler Maschine mit Docker Desktop unter Windows - ab Version 18.x)
* MSSQL DB (ab Version 12)

### Installation Steps
1. Bereitstellen einer SQL DB ([Anleitung](https://github.com/jmurighub/SeicentoSalary/tree/master/flyway)) 
2. Registrieren einer App im Azure Portal ([Anleitung](https://github.com/jmurighub/SeicentoSalary/tree/master/docs/azuread))
3. Starten des Docker Containers [Anleitung](https://github.com/jmurighub/SeicentoSalary/tree/master/docs/docker)

Optional:
* Setup Jasperserver/Reports ([Anleitung](https://github.com/jmurighub/SeicentoSalary/tree/master/docs/jasperserver))
* Erstellen eines Reverse Proxy mit nginx ([Anleitung](https://github.com/jmurighub/SeicentoSalary/tree/master/docs/nginx))


## PrintScreen
![StartScreen](https://github.com/jmurighub/SeicentoSalary/blob/master/docs/images/SeicentoSalary_OverviewBvg.PNG "StartScreen")