# "Effective programming in Java" workshop

What tools are required:
* any IDE with Java support (Eclipse Mars/IntelliJ IDEA are prefered),
* JDK 1.8 (newest update)

## How to prepare your development environment?

### Eclipse

* Create new workspace,
* Configure Eclipse to use JDK 1.8,

> Window->Preferences->Java->Installed JRE

* Set JDK Compliance level to 1.8,

> Window->Preferences->Java->Compiler->1.8

* Clone EffectiveJava repository to the workspace,
* Create new Java project with EffectiveJava name
* If you have any problems with unit tests compilation (e.g. Eclipse claims that import of org.junit.Assert.* can not be resolved) you should:
  * Goto project properties: **Properties** -> **Java Build Path**
  * On the **Libraries** tab click **"Add Library..."** button,
  * Choose **JUnit** and **Apply** changes,
  * Imports should be properly resolved now

### IntelliJ

Check out from Version Control->Git

## Survey

I'm looking forward to know your opinion about the workshop and problems that it covers.

If possible please take 1-2 minutes to fill in a survey about your reception of the workshop:

http://goo.gl/forms/wrqCvBJ7VN

Thanks in advance!
