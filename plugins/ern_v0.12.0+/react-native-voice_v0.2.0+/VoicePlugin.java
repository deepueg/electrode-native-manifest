package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import com.wenkesj.voice.VoicePackage;

public class VoicePlugin implements ReactPlugin {

    public ReactPackage hook(@NonNull Application application,
                     @Nullable ReactPluginConfig config) {
        return new VoicePackage();
    }
}
