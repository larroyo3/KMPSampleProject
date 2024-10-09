# 🚀 KMPSampleProject

![badge-android](http://img.shields.io/badge/platform-android-6EDB8D.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-CDCDCD.svg?style=flat)

## 📱 Project Overview
**KMPSampleProject** is a sample mobile application built with **Kotlin Multiplatform (KMP)**, **Jetpack Compose**, and **SwiftUI**. This project demonstrates best practices for clean architecture and modular design in cross-platform mobile apps. It serves as a reference for developers aiming to create maintainable and scalable mobile projects.

If you find my work helpful, please consider giving it a ⭐ ❤️.


> **Note**: This project is currently in its early stages of development. More features and improvements will be added over time.

</br>

## 👤 About Me

<p><a target="_blank" href="https://www.linkedin.com/in/lucas-arroyo" style="display: inline-block;"><img src="https://img.shields.io/badge/linkedin-logo?style=for-the-badge&logo=linkedin&logoColor=white&color=%230a77b6" alt="linkedin" height="30" /></a> <a target="_blank" href="https://www.instagram.com/acyll_studios" style="display: inline-block;"><img src="https://img.shields.io/badge/instagram-logo?style=for-the-badge&logo=instagram&logoColor=white&color=%23F35369" alt="instagram" height="30"/></a> <a target="_blank" href="https://twitter.com/acyll_studios" style="display: inline-block;"><img src="https://img.shields.io/badge/twitter-x?style=for-the-badge&logo=x&logoColor=white&color=%230f1419" alt="twitter" height="30" /></a><a target="_blank" href="https://buymeacoffee.com/acyll" style="display: inline-block;"><img src="https://img.shields.io/badge/Buy%20Me%20a%20Coffee-ffdd00?style=for-the-badge&logo=buy-me-a-coffee&logoColor=black" alt="BuyMeACoffee" height="30" /></a></p>

Hi, I'm **Lucas Arroyo**, a mobile developer specializing in **Android** and **cross-platform development** using **KMP**. If you have any feedback or suggestions to improve this project, don't hesitate to contact me!



</br>

## 🛠 What is Kotlin Multiplatform (KMP) and Jetpack Compose?

### Kotlin Multiplatform (KMP)
**Kotlin Multiplatform (KMP)** is an innovative technology that allows developers to share common code across multiple platforms, such as Android, iOS, desktop, and web, while still enabling platform-specific code when needed. This flexibility makes it easier to write maintainable, reusable code, reducing duplication and simplifying the development process for cross-platform applications.

With KMP, you can:
- **Write once, run anywhere**: Share business logic, data models, and network code across platforms.
- **Use platform-specific code** when needed: Access native APIs (like Android's Room database or iOS's CoreData) through platform-specific modules.
- **Streamline development**: By having a single codebase for your business logic, you reduce the overhead of maintaining multiple codebases and simplify bug fixes and feature updates.

#### Why KMP?
- **Code Reusability**: Write common code once, and share it across Android, iOS, desktop, and more.
- **Flexibility**: KMP lets you use platform-specific code when necessary, ensuring you can still leverage native features.
- **Consistency**: By using KMP, you maintain consistent business logic and architecture across all platforms, which leads to fewer inconsistencies between apps.

Learn more about [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)

### Jetpack Compose
**Jetpack Compose** is Google's modern UI toolkit for building native Android UIs with a declarative, reactive programming model. It simplifies UI development by eliminating the need to use imperative UI frameworks like XML-based layouts. With Jetpack Compose, you describe your UI as functions (composables) that automatically recompose when data changes.

Learn more about [Jetpack Compose](https://developer.android.com/compose)

#### Key Features of Jetpack Compose:
- **Declarative UI**: Instead of defining how the UI changes over time with imperative logic, you declare what the UI should look like at any given state.
- **Composability**: Build UIs by combining small, reusable UI elements (composables) that can easily be assembled and reassembled.
- **Seamless Integration**: Jetpack Compose is fully interoperable with existing Android views and code, meaning you can gradually adopt it in existing projects.
- **Kotlin-first**: Jetpack Compose is designed to work with Kotlin, offering concise syntax, coroutines for asynchronous tasks, and interoperability with other Jetpack libraries.

### SwiftUI (for iOS)
Just like Jetpack Compose for Android, **SwiftUI** is Apple's declarative UI framework for building UIs in iOS. With SwiftUI, you can build UIs in a similar fashion, using reactive programming concepts to automatically update the UI when data changes.

Learn more about [SwiftUI](https://developer.apple.com/xcode/swiftui/)

#### Why Compose and SwiftUI Together?
Using **Compose** for Android and **SwiftUI** for iOS in a **Kotlin Multiplatform** project lets you:
- **Leverage native performance**: Each platform still uses its native UI framework, ensuring optimal performance.
- **Consistent UI patterns**: Both Compose and SwiftUI share similar declarative patterns, making it easier for developers to switch between platforms.
- **Reduce learning curve**: Developers familiar with declarative programming can more easily transition between Android and iOS development.

</br>

## 📚 Tech Stack 
- [Kotlin Multiplatform](https://kotlinlang.org/lp/multiplatform/)
- [Jetpack Compose](https://developer.android.com/compose)
- [SwiftUI](https://developer.apple.com/xcode/swiftui/)
- [Kotlin Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
- [Ktor](https://ktor.io/)

</br>

## 🏗️ How to Build the App

#### Android
1. Clone the repository: `git clone https://github.com/your-repo.git`
2. Open the project in **Android Studio**.
3. Sync the Gradle files.
4. Run the app on an **Android emulator** or physical device.

#### iOS
1. Clone the repository: `git clone https://github.com/your-repo.git`
2. Open the iOS project in **Xcode**.
3. Select your target device (simulator or physical).
4. Run the app.

</br>

## 🌍 Global Best Practices Implemented

### Project Structure

- **`/composeApp`**: Contains shared code for your Compose Multiplatform applications, with `commonMain` holding code that can run on both Android and iOS. Platform-specific code resides in corresponding folders like `iosMain` for iOS-specific implementations.
  
- **`/iosApp`**: Contains the iOS-specific entry point and any SwiftUI code. Even when sharing the UI with Compose Multiplatform, you'll still need to manage the native entry points for the iOS app in Xcode.
  
- **`/shared`**: Houses shared business logic, network, and data handling code that can be reused across all platforms. The `commonMain` folder inside `/shared` contains the core logic shared by both Android and iOS apps.


Here are the global coding practices applied across the entire project:

<!--
- **Separation of Concerns**: Clean separation between UI, business logic, and data layers using the **Clean Architecture** pattern. 
- **Dependency Injection**: Implemented with **Koin**/**Dagger** for better scalability and decoupling.
- **Immutable Data**: Wherever possible, we use immutable data structures to avoid unexpected side effects.
- **Centralized State Management**: Utilizing **StateFlow** or **LiveData** for predictable and maintainable UI state.
- **Test Coverage**: Unit tests ensure high code reliability and ease of refactoring.
-->

> **Note**: Since this project is still in its early stages, additional best practices and refinements will be implemented as development progresses.

</br>

## 🧩 Module-Specific Best Practices

Each module in the project follows its own set of best practices. Here's a quick breakdown:

<!--
### 🏠 Home Module
- **Single Responsibility Principle (SRP)**: The **Home** module is focused solely on displaying the app's main dashboard.
- **Dynamic Feature Loading**: Each tile in the dashboard links to a separate, dynamically loaded feature module.

### 👤 Profile Module
- **MVVM Architecture**: Separation of concerns using the **Model-View-ViewModel** pattern.
- **Reactive State Handling**: Uses **StateFlow** for efficient UI state management.

### 📦 Qbox Module
- **Efficient Caching**: Implements local caching to minimize network requests and ensure smooth performance.
- **Offline Support**: Built with offline-first principles, ensuring the module works without an active internet connection.
-->

> **Note**: As modules are still being developed, these best practices will continue to evolve.

</br>

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repository, make your improvements, and submit a pull request. Let's collaborate to make this project even better!

Thank you for checking out **KMPSampleProject**! Together, we can make cross-platform development more efficient and enjoyable.

