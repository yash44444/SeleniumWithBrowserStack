# Integration of Selenium and Browserstack
BrowserStack is a cloud-based cross-browser testing tool that allows developers and testers to test their web and mobile applications on a wide range of desktop and mobile browsers, operating systems, and real devices. It is a paid tool but very good tool. Alternatives: Saucelabs, lambdaTest, ChromeEmulator, Selenoid, selenium grid.

You can select - 
Browser - chrome, firefox, edge, safari
Operating system - ios(mobile), os x(laptop), android(mobile), windows(laptop)
Mobile device - 
x version

# Prerequisites
TestNG v6.8+, Java v8+
Browserstack account
Dependecies as mentioned in pom.xml

# Options to perform cross browser testing
Option1 - Grid is a concept having hub n node structure, where each node have a separate OS,browser,version. This concept was 7-8 years back when we needed to have multiple physical machines.

Option2 - Having VMs provided by different vendors , again expensive.

Option3 - Docker container
each container having a browser, version. but problem is there is no image for ie and safari. 

Option4 - Cloud, aws/azure/google/alibaba. Each EC2 instance act as a VM.

Option5 - cloud tools like BrowserStack, lambdaTest, Saucelabs
running tests using Java on BrowserStack’s Selenium Grid of 3000+ real devices and desktop browsers.

- Configure browser and respective versions in testng.xml file
- Configure Desired Capabilites in base test to intergrate selenium with browser stack.
- Run as Testng.xml suite
- View the results on browser stack home page. 
- To run via Jenkins, you would need 'Brwserstack' plugin