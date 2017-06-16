This project is a java client of OpenSTF REST API allows you to reserve and release any STF device in device farm.

You can find more information about [STF API](https://raw.githubusercontent.com/openstf/stf/master/doc/API.md)

```
        Stf stf = new Stf(BASE_URL, AUTH_TOKEN);
        
        DeviceOperations device = new DeviceOperations(stf);
        String deviceSerial = device.getDeviceFromList("LG-H815").getSerial();
        
        UserOperations userOperations = new UserOperations(stf);
        userOperations.addDevice(deviceSerial);
                
        RemoteConnectResponse remoteConnectResponse = userOperations.remoteConnect(deviceSerial);
        userOperations.adbConnect(remoteConnectResponse.getRemoteConnectUrl())
        
        userOperations.remoteDisconnect(deviceSerial);
        userOperations.deleteDevice(deviceSerial);
```