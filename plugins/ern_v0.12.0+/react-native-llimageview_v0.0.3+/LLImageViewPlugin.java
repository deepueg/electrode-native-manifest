package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import net.livelinktechnology.llimageview.LLImageViewPackage;

public class LLImageViewPlugin implements ReactPlugin {
    public ReactPackage hook(@NonNull Application application,
                     @Nullable ReactPluginConfig config) {
        return new LLImageViewPackage();
    }
}
