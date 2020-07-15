package com.skplanet.refactorexample.step07;

import lombok.Data;

@SuppressWarnings("unused")
// Extract Method
// Simplify or Cleanup code
// Move method
public class MoveMethodComplete {

    enum MemberType {
        SUPER_ADMIN,
        ADMIN,
        USER,
    }

    static class MemberService {

        public Boolean checkUserType(Member member) {
            return member.isUser();
        }
    }

    @Data
    private static class Member {

        private MemberType memberType;

        private Boolean isUser() {
            return getMemberType() == MemberType.USER;
        }
    }
}
