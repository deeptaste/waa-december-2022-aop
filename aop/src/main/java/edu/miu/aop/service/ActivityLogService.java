package edu.miu.aop.service;

import edu.miu.aop.entity.ActivityLog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface ActivityLogService {

    void save(ActivityLog address);

    List<ActivityLog> getAll();

    List<ActivityLog> findAllByDate(LocalDate date);

    List<ActivityLog> findAllByDurationGreaterThan(long minDuration);

}