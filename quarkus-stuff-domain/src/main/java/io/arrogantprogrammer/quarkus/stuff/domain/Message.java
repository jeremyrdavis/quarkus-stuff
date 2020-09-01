package io.arrogantprogrammer.quarkus.stuff.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.StringJoiner;

@RegisterForReflection
public class Message {

    String id;

    String body;

    /**
	 * Empty constructor
	 */
	public Message() {
        super();
	}

    /**
	 * @param id
	 * @param body
	 */
	public Message(String id, String body) {
		this.id = id;
		this.body = body;
    }

	@Override
	public String toString() {
		return new StringJoiner(", ", Message.class.getSimpleName() + "[", "]")
				.add("id='" + id + "'")
				.add("body='" + body + "'")
				.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		return true;
	}

    /**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

}