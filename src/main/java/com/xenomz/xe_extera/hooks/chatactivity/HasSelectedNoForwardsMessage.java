package com.xenomz.xe_extera.hooks.chatactivity;

import de.robv.android.xposed.XC_MethodHook;
import com.xenomz.xe_extera.settings.Settings;

public class HasSelectedNoForwardsMessage extends XC_MethodHook {
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam param) {
        if (Settings.noForward()) {
            param.setResult(false);
        }
    }
}
