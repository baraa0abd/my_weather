import data.repository.LocationRepositoryImpl
import domain.repository.LocationRepository
import domain.util.location_getter.LocationFetcher
import org.koin.dsl.module

//package di
//
//import org.koin.dsl.module
//import presentation.ClothesSuggesterConsoleUI
//import presentation.io.ConsoleIO
//import presentation.io.ConsoleIOImpl
//import java.util.*
//
//val presentationModule = module {
//    single { Scanner(System.`in`) }
//    single<ConsoleIO> { ConsoleIOImpl(get()) }
//
//    // Authentication UI
//    single { ClothesSuggesterConsoleUI(get(), get(), get(), get(), get()) }
//}

val appModule = module {
    single<LocationRepository> { LocationRepositoryImpl() }
}