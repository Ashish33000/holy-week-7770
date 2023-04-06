

package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BrokerAdminSession {
	@Id
	@Column(unique = true)
	private Integer brokerId;
	private String uuid;
	private LocalDateTime localDateTime;

}
