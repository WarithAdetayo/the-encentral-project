package com.encentral.staffsync.configuration.permission.impl;

import com.encentral.staffsync.configuration.permission.api.IPermission;
import com.google.inject.AbstractModule;

public class PermissionModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IPermission.class).to(DefaultPermissionImpl.class);
    }
}
