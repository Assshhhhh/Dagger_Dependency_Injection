package com.example.dagger_dependency_injection

import com.example.dagger_dependency_injection.repo.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    // Constructor Injection
        // Unit Testing -> Yes
        // Single Responsibility -> Yes
        // Lifetime of these Objects -> Yes
        // Extensible -> Yes

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.sendEmail(email,"from@example.com", "User Registered Successfully")
    }

}

/*
class UserRegistrationService {

    // Field Injection
        // Unit Testing -> X
        // Single Responsibility -> X
        // Lifetime of these Objects -> X
        // Extensible -> X

    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.sendEmail(email,"example@gmail.com", "User Registered Successfully")
    }

}
*/

