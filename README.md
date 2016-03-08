# EffectiveJava workshop

## How to prepare your development environment?

### Eclipse with installed m2e-egit connector

Import->Maven->Check out Maven Projects from SCM

### Eclipse without m2e connector

* Create new workspace
* Configure Eclipse to use JDK rather than JRE. JDK8 must be used.

Window->Preferences->Java->Installed JRE

* Set JDK Compliance level to 1.8

Window->Preferences->Java->Compiler->1.8

* Clone EffectiveJava repository to the workspace
* Create new Java project with EffectiveJava name
* Convert project to a Maven Project

Right click on the project->Configure->Convert to Maven project

### IntelliJ

Check out from Version Control->Git 