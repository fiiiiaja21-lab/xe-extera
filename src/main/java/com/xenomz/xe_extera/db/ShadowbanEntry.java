package com.xenomz.xe_extera.db;

public final class ShadowbanEntry {
    public final long addedTs;
    public final boolean hideDialog;
    public final boolean hideInGroups;
    public final long userId;

    public ShadowbanEntry(long userId, boolean hideDialog, boolean hideInGroups, long addedTs) {
        this.userId = userId;
        this.hideDialog = hideDialog;
        this.hideInGroups = hideInGroups;
        this.addedTs = addedTs;
    }
}
