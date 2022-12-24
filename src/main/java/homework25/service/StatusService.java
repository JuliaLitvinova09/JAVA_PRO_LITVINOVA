package homework25.service;

import homework25.dao.StatusDio;
import homework25.model.Status;

import java.util.List;

public class StatusService {
    private StatusDio statusDao= new StatusDio();

    public void save(Status status) {
        if (status == null) {
            System.out.println("status is null");
        }
        statusDao.save(status);
    }
    public void update(Status status) {
        if (status == null) {
            System.out.println("status is null");
        }
        statusDao.update(status);
    }
    public void delete(Status status) {
        if (status == null) {
            System.out.println("status is null");
        }
        statusDao.delete(status);
    }
    public Status getById(int id) {
        Status status = statusDao.getById(id);
        return status;
    }

    public List<Status> getAll() {
        return statusDao.getAll();
    }

}
