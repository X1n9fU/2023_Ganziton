package com.luckyseven.greendrive.Repository;

import com.luckyseven.greendrive.Domain.Likes;
import com.luckyseven.greendrive.Domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Long> {

    @Query("SELECT l from Likes l WHERE l.user.userId =:userId and l.review.id =:reviewId")
    Likes findByUserIdAndReviewId(@Param("userId") String userId, @Param("reviewId") long reviewId);
}
