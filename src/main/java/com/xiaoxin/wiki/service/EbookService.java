package com.xiaoxin.wiki.service;

import com.xiaoxin.wiki.domain.Ebook;
import com.xiaoxin.wiki.mapper.EbookMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);

    @Resource
    private EbookMapper ebookMapper;


    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
