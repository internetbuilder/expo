// Copyright 2015-present 650 Industries. All rights reserved.

package expo.modules.sensors.services;

import android.content.Context;
import android.hardware.Sensor;

import java.util.Collections;
import java.util.List;

import org.unimodules.core.interfaces.InternalModule;

public class GyroscopeService extends SubscribableSensorService implements InternalModule, expo.modules.sensors.interfaces.services.GyroscopeService {
  public GyroscopeService(Context context) {
    super(context);
  }

  @Override
  int getSensorType() {
    return Sensor.TYPE_GYROSCOPE;
  }


  @Override
  public List<Class> getExportedInterfaces() {
    return Collections.<Class>singletonList(expo.modules.sensors.interfaces.services.GyroscopeService.class);
  }
}
