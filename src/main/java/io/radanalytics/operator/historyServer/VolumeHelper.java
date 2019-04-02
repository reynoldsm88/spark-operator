package io.radanalytics.operator.historyServer;

import io.radanalytics.types.RCSpec;

public class VolumeHelper {

    public static boolean needsVolume( RCSpec spec ) {
        return spec.getVolumeMounts() != null;
    }

}
