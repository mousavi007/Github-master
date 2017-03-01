/*
 * Copyright (C) 2016 david.wei (lighters)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lighters.github.common.di.component;

import android.content.Context;
import com.lighters.github.common.di.module.ApplicationModule;
import com.lighters.github.data.repository.TokenModule;
import com.lighters.github.data.repository.login.LoginCache;
import com.lighters.github.data.repository.login.TokenRepository;
import com.lighters.github.ui.base.BaseActivity;
import dagger.Component;
import javax.inject.Singleton;
import retrofit2.Retrofit;

/**
 * Created by david on 16/3/23.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
@Singleton
@Component(modules = { ApplicationModule.class, TokenModule.class})
public interface ApplicationComponent {

    void inject(BaseActivity baseActivity);

    //Exposed to sub-graphs.
    Context context();

    Retrofit retrofit();

    LoginCache loginCache();


    TokenRepository tokenRepository();

}
