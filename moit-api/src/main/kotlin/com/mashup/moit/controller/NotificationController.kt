package com.mashup.moit.controller

import com.mashup.moit.common.MoitApiResponse
import com.mashup.moit.infra.fcm.FCMNotificationService
import com.mashup.moit.sample.controller.sample.dto.SampleNotificationRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/sample-noti")
class NotificationController(
    private val fcmNotificationService: FCMNotificationService
) {
    @PostMapping("/pushs/topics")
    fun notificationTopics(): MoitApiResponse<Unit> {
        val sampleNotificationRequest = SampleNotificationRequest.sample()
        fcmNotificationService.sendTopicSampleNotification(sampleNotificationRequest)
        return MoitApiResponse.success()
    }
}
