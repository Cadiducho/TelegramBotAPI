/*
 * The MIT License
 *
 * Copyright 2018 Cadiducho.
 * Read more in https://github.com/Cadiducho/Telegram-Bot-API/blob/master/LICENSE
 */

package com.cadiducho.telegrambotapi;


import com.squareup.moshi.Json;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This object represents a sticker set.
 */
@ToString
@Getter @Setter
public class ChatPhoto {
    
    /**
     * File identifier of small (160x160) chat photo. This file_id can be used only for photo download.
     */
    @Json(name = "small_file_id") private String smallFileId;

    /**
     * Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    @Json(name = "small_file_unique_id") private String smallFileUniqueId;
    
    /**
     * File identifier of big (640x640) chat photo. This file_id can be used only for photo download.
     */
    @Json(name = "big_file_id") private String bigFileId;

    /**
     * Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time and for different bots.
     * Can't be used to download or reuse the file.
     */
    @Json(name = "big_file_unique_id") private String bigFileUniqueId;
    
}
