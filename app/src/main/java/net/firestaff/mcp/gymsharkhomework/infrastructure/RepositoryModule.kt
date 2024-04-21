package net.firestaff.mcp.gymsharkhomework.infrastructure

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)  // Scoped to ViewModel lifecycle
object RepositoryModule {
    @Provides
    fun provideProductRepository(): ProductRepository = MockProductRepository() //MockProductRepository() //ApiProductRepository()
}