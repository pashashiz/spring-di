package com.mobius.example;

// This class should be implemented in other module, for example "central-config", this is just an example
public class CentralizedConfiguration {

    private boolean isLicenseValid;

    public CentralizedConfiguration(boolean isLicenseValid) {
        this.isLicenseValid = isLicenseValid;
    }

    public boolean isLicenseValid() {
        return true;
    }

}
