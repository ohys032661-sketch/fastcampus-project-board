INSERT INTO article (
    title,
    content,
    hashtag,
    created_at,
    created_by,
    modified_at,
    modified_by
) VALUES
      ('게시글 1', '게시글 1 내용입니다.', '#spring', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 2', '게시글 2 내용입니다.', '#jpa', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 3', '게시글 3 내용입니다.', '#java', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 4', '게시글 4 내용입니다.', '#backend', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 5', '게시글 5 내용입니다.', '#database', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 6', '게시글 6 내용입니다.', '#hibernate', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 7', '게시글 7 내용입니다.', '#springboot', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 8', '게시글 8 내용입니다.', '#mvc', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 9', '게시글 9 내용입니다.', '#rest', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 10', '게시글 10 내용입니다.', '#api', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 11', '게시글 11 내용입니다.', '#querydsl', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 12', '게시글 12 내용입니다.', '#security', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 13', '게시글 13 내용입니다.', '#jwt', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 14', '게시글 14 내용입니다.', '#oauth', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 15', '게시글 15 내용입니다.', '#test', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 16', '게시글 16 내용입니다.', '#junit', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 17', '게시글 17 내용입니다.', '#assertj', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 18', '게시글 18 내용입니다.', '#gradle', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 19', '게시글 19 내용입니다.', '#intellij', NOW(), 'admin', NOW(), 'admin'),
      ('게시글 20', '게시글 20 내용입니다.', '#project', NOW(), 'admin', NOW(), 'admin');


INSERT INTO article_comment (
    article_id,
    content,
    created_at,
    created_by,
    modified_at,
    modified_by
) VALUES
      (1, '게시글 1의 댓글 1', NOW(), 'user1', NOW(), 'user1'),

      (2, '게시글 2의 댓글 1', NOW(), 'user1', NOW(), 'user1'),
      (2, '게시글 2의 댓글 2', NOW(), 'user2', NOW(), 'user2'),

      (3, '게시글 3의 댓글 1', NOW(), 'user1', NOW(), 'user1'),
      (3, '게시글 3의 댓글 2', NOW(), 'user2', NOW(), 'user2'),

      (4, '게시글 4의 댓글 1', NOW(), 'user1', NOW(), 'user1'),
      (4, '게시글 4의 댓글 2', NOW(), 'user2', NOW(), 'user2'),
      (4, '게시글 4의 댓글 3', NOW(), 'user3', NOW(), 'user3'),

      (5, '게시글 5의 댓글 1', NOW(), 'user1', NOW(), 'user1'),

      (7, '게시글 7의 댓글 1', NOW(), 'user1', NOW(), 'user1'),
      (7, '게시글 7의 댓글 2', NOW(), 'user2', NOW(), 'user2'),
      (7, '게시글 7의 댓글 3', NOW(), 'user3', NOW(), 'user3'),

      (8, '게시글 8의 댓글 1', NOW(), 'user1', NOW(), 'user1'),
      (8, '게시글 8의 댓글 3', NOW(), 'user3', NOW(), 'user3'),

      (9, '게시글 9의 댓글 1', NOW(), 'user1', NOW(), 'user1'),
      (9, '게시글 9의 댓글 2', NOW(), 'user2', NOW(), 'user2'),

      (10, '게시글 10의 댓글 1', NOW(), 'user1', NOW(), 'user1')
