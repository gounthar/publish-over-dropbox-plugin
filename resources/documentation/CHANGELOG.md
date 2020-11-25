# Changelog

### 1.2.4 (June 2018)

-   Fix proxy config related crash on remote instances  
    Fixes [JENKINS-52039](https://issues.jenkins-ci.org/browse/JENKINS-52039)
-   Upgraded minimal required Jenkins version to 2.98

### 1.2.3 (June 2018)

-   Supports using the Jenkins proxy configuration  
    Fixes [JENKINS-51478](https://issues.jenkins-ci.org/browse/JENKINS-51478)

### 1.2.2 (Januari 2018)

-   The underlying "Publish Over" library has been updated in 0.21  
    Fixes [JENKINS-48926](https://issues.jenkins-ci.org/browse/JENKINS-48926)

### 1.2.1 (September 2017)

-   Fix not overwritting large files  
    Fixes [JENKINS-46533](https://issues.jenkins-ci.org/browse/JENKINS-46533?src=confmacro)
-   Add field description to the step Snippet Generator

### 1.2.0 (July 2017)

-   Add build pipeline DSL support  
    Fixes JENKINS-43230
-   Fixed an encoding issue with directory creation  
    Fixes JENKINS-45309
-   Autorename attribute typo fixed  
    Fixes [JENKINS-40196](https://github.com/jenkinsci/publish-over-dropbox-plugin/commit/1cffda729f60f82cd52e1e60443b1b1f00580f73 "Request field typo, fixes JENKINS-40196")
-   Improved some error messages

### 1.1.2 (Dec 2016)

-   Fix malformed chunk upload request  
    Fixes [JENKINS-40196](https://issues.jenkins-ci.org/browse/JENKINS-40196)

### 1.1.1 (Nov 2016)

-   Large uploads are chunked in uploads of 4 MB each  
    Fixes [JENKINS-39093](https://issues.jenkins-ci.org/browse/JENKINS-39093)
-   The plugin uses Dropbox V2 API  
    Fixes [JENKINS-36407](https://issues.jenkins-ci.org/browse/JENKINS-36407)
-   Switch to a more future-proof Dropbox Client ID
-   Update parent plugin to version 2.6  
    Addresses [INFRA-588](https://issues.jenkins-ci.org/browse/INFRA-588)

### 1.0.5 (Nov 8 2015)

-   Fixes [JENKINS-31112](https://issues.jenkins-ci.org/browse/JENKINS-31112)

### 1.0.3 (Sep 21 2015)

First function release

### 1.0.2 (Sep 21 2015)

Failed non-functioning release

### 1.0.1 (Sep 20 2015)

Failed non-functioning release

### 1.0.0 (Sep 19 2015)

Failed non-functioning release
