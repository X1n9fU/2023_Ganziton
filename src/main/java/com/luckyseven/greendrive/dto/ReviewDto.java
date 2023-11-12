package com.luckyseven.greendrive.dto;


import com.luckyseven.greendrive.Domain.Image;
import com.luckyseven.greendrive.Domain.Review;
import com.luckyseven.greendrive.Domain.Space;
import com.luckyseven.greendrive.Domain.User;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ReviewDto {

    private long id;
    private String userId;
    private MultipartFile reviewImage;
    private String content;
    private Integer satisfaction;

}
