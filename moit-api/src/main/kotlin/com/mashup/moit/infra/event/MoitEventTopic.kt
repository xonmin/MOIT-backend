package com.mashup.moit.infra.event

object KafkaEventTopic {
    const val MOIT_CREATE = "moit_create"
    const val STUDY_INITIALIZE = "study_initialize"
    const val STUDY_ATTENDANCE = "study_attendance"
    const val STUDY_ATTENDANCE_BULK = "study_attendance_bulk"
    const val STUDY_ATTENDANCE_START_NOTIFICATION = "study_attendance_start_notification"
    const val STUDY_SCHEDULED_NOTIFICATION = "study_scheduled_notification"
    const val FINE_CREATE = "fine_create"
    const val FINE_CREATE_BULK = "fine_create_bulk"
    const val FINE_APPROVE = "fine_approve"
    const val REMIND_FINE_NOTIFICATION = "remind_fine_notification"
}

object KafkaConsumerGroup {
    const val MOIT_CREATE_STUDY_CREATE = "moit_create_study_create"
    const val STUDY_INITIALIZE_BANNER_UPDATE = "study_initialize_banner_update"
    const val STUDY_ATTENDANCE_FINE_CREATE = "study_attendance_fine_create"
    const val STUDY_ATTENDANCE_FINE_CREATE_BULK = "study_attendance_fine_create_bulk"
    const val STUDY_ATTENDANCE_START_NOTIFICATION_CREATE = "study_attendance_start_notification_create"
    const val STUDY_SCHEDULED_NOTIFICATION_CREATE = "study_scheduled_notification_create"
    const val FINE_CREATE_BANNER_UPDATE = "fine_create_banner_update"
    const val FINE_CREATE_BANNER_UPDATE_BULK = "fine_create_banner_update_bulk"
    const val FINE_APPROVE_BANNER_UPDATE = "fine_approve_banner_update"
    const val REMIND_FINE_NOTIFICATION_CREATE = "remind_fine_notification_create"
}
