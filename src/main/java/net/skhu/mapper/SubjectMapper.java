package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Subject;

@Mapper
public interface SubjectMapper {
	List<Subject> find();

	List<Subject> findById(String st);

	List<Subject> findByName(String st);
}
