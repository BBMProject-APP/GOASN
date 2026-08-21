# Implementation Plan - Project-wide Error Repair and Functionality Maintenance

The goal is to resolve all compiler errors and warnings across the project while ensuring all existing features (Quiz, Materi, Akun, Statistik) remain fully functional. Many errors are related to Compose compiler type inference issues which will be addressed by providing explicit types and fixing scope usage.

## Proposed Changes

### [Core]

#### [MODIFY] [MainActivity.kt](file:///E:/ANDROID-STUDIO/CATCPNSAPP/app/src/main/java/com/example/MainActivity.kt)
- Resolve `isLoading` reference error by adding the property to `QuizViewModel`.
- Fix Compose compiler errors by adding explicit lambda parameter types for `setContent`, `Surface`, `AlertDialog`, and `TextButton`.
- Use KTX `sharedPreferences.edit { ... }` to fix the lint warning.

#### [MODIFY] [QuizViewModel.kt](file:///E:/ANDROID-STUDIO/CATCPNSAPP/app/src/main/java/com/example/presentation/QuizViewModel.kt)
- Add `val isLoading = MutableStateFlow(true)` to track initialization state.
- Set `isLoading.value = false` after `repository.initializeApp()` and other startup logic in the `init` block.

## Verification Plan

### Automated Tests
- Run `analyze_file` on all modified files to ensure 0 errors.
- Perform a full project build: `gradle_build(":app:assembleDebug")`.

### Manual Verification
- Deploy the app to a device/emulator.
- Verify the Disclaimer Dialog appears on first launch.
- Navigate through all screens (Home, Materi, Quiz, Result, Review, Akun, Statistik) and ensure no crashes.
- Test name change in Akun screen.
- Verify progress tracking and scoring logic.
