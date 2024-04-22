package net.firestaff.mcp.gymsharkhomework.infrastructure

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import net.firestaff.mcp.gymsharkhomework.infrastructure.product.MockProductRepository
import net.firestaff.mcp.gymsharkhomework.infrastructure.product.ProductRepository
import net.firestaff.mcp.gymsharkhomework.infrastructure.wishlist.MemoryWishlistRepository
import net.firestaff.mcp.gymsharkhomework.infrastructure.wishlist.WishlistRepository

@Module
@InstallIn(ViewModelComponent::class)  // Scoped to ViewModel lifecycle
object RepositoryModule {
    @Provides
    fun provideProductRepository(): ProductRepository = MockProductRepository()  //ApiProductRepository()

    @Provides
    fun provideWishlistRepository(): WishlistRepository = MemoryWishlistRepository()
}