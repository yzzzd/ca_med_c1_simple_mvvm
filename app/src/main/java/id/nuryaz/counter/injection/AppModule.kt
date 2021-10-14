package id.nuryaz.counter.injection

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import id.nuryaz.counter.data.SaveCounter

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Provides
    fun provideSaveCounter(@ApplicationContext context: Context) = SaveCounter(context)
}