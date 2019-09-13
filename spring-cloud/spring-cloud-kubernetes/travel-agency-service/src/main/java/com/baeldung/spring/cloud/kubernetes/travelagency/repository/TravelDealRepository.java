package com.baeldung.spring.cloud.kubernetes.travelagency.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.spring.cloud.kubernetes.travelagency.model.TravelDeal;

public interface TravelDealRepository extends JpaRepository<TravelDeal, String> {
}