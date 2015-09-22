package kfs.kfsbotoctopus.service;

import kfs.kfsbotoctopus.domain.OctoAdvert;
import kfs.kfscrm.domain.KfsContact;

/**
 *
 * @author pavedrim
 */
public interface OctopusReplyService {
    void replyOctopus(OctoAdvert oa, KfsContact co);

}
