package in.shubhammangla.blog.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comment {

	@Id
    private ObjectId id;
	
	private ObjectId parentDiscussionId;
	
	private String postId;
	private String userId;
	
	private Date postedAt;
	private String message;
	
	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	/**
	 * @return the parentDiscussionId
	 */
	public ObjectId getParentDiscussionId() {
		return parentDiscussionId;
	}
	/**
	 * @param parentDiscussionId the parentDiscussionId to set
	 */
	public void setParentDiscussionId(ObjectId parentDiscussionId) {
		this.parentDiscussionId = parentDiscussionId;
	}
	
	/**
	 * @return the postId
	 */
	public String getPostId() {
		return postId;
	}
	/**
	 * @param postId the postId to set
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the postedAt
	 */
	public Date getPostedAt() {
		return postedAt;
	}
	/**
	 * @param postedAt the postedAt to set
	 */
	public void setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
