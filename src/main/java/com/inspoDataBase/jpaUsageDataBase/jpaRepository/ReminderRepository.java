package com.inspoDataBase.jpaUsageDataBase.jpaRepository;


import com.inspoDataBase.entity.Reminder;
import com.inspoDataBase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mmikilchenko on 09.02.2017.
 */
public interface ReminderRepository extends JpaRepository<Reminder, Integer> {
    Reminder saveAndFlush(Reminder reminder);

    List<Reminder> findAll();

    List<Reminder> findByText(String text);

   Reminder findByReminderId(int reminderId);

    /**
     * Finds a reminder by using the user as a search criteria.
     *
     * @param user
     * @return A list of reminders whose user is an exact match with the given user.
     * If no reminders is found, this method returns an empty list.
     */
    List<Reminder> findByUser(User user);

    List<Reminder> findByUserAndText(User user, String text);

    /**
     * ( demonstrate the usage of @Query annotation )
     * Deletes a reminder by using the reminderId as a search criteria.
     *
     * @param reminderId
     */

    //@Query("DELETE FROM Reminder  WHERE reminder_id =:reminderId")
    void deleteByReminderId(/*@Param("reminderId") */int reminderId);


}
