package com.xenomz.xe_extera.hooks.messageobject;

import de.robv.android.xposed.XC_MethodHook;
import com.xenomz.xe_extera.settings.Settings;

public class CanForwardMessage extends XC_MethodHook {
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam param) {
        if (Settings.noForward()) {
            param.setResult(true);
        }
    }
}
