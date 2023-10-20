package metanit.chap4.c3_package

import email.send as sendEmail
import email.Message as EmailMessage
import sms.send as sendSms
import sms.Message as SmsMessage

fun main() {
    val myMessage = EmailMessage("Hello Kotlin")
    sendEmail(myMessage, "tom@gmail.com")
    val mySmsMessage = SmsMessage("Hello Kotlin")
    sendSms(mySmsMessage, "+1234567890")
}