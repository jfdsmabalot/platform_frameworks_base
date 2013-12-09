package com.android.internal.util.gnome;

import android.content.Intent;

public class TorchConstants {
    /**
* Package name of the torch app
*/
    public static final String APP_PACKAGE_NAME = "net.cactii.flash2";

    /**
* Intent broadcast action for toggling the torch state
*/
    public static final String ACTION_TOGGLE_STATE = APP_PACKAGE_NAME + ".TOGGLE_FLASHLIGHT";

    /**
* Extra for {@link ACTION_TOGGLE_STATE}:
* When toggling to on, use the bright brightness setting
* Type: boolean
*/
    public static final String EXTRA_BRIGHT_MODE = "bright";

    /**
* Intent action for 'torch state changed' broadcast
*/
    public static final String ACTION_STATE_CHANGED = APP_PACKAGE_NAME + ".TORCH_STATE_CHANGED";

    /**
* Extra for {@link ACTION_STATE_CHANGED}:
* Current torch state
* Type: integer (0/1)
*/
    public static final String EXTRA_CURRENT_STATE = "state";

    /**
* Intent for launching the torch application
*/
    public static Intent INTENT_LAUNCH_APP = new Intent(Intent.ACTION_MAIN)
            .setClassName(APP_PACKAGE_NAME, APP_PACKAGE_NAME + ".MainActivity");
}
